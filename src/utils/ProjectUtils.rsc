module utils::ProjectUtils

import IO;
import lang::java::jdt::m3::Core;
import utils::StringUtils;

@doc{
	Creates an M3 model of an Eclipse project.
	
	Parameters:
	- loc projectLocation: A location to an Eclipse project
	
	Returns: 
	- M3 model
}
public M3 createM3Model(loc projectLocation) {
	return createM3FromEclipseProject(projectLocation);
}

@doc{
	Retrieve java files from M3 model.

	Parameters:
	- M3 model: An M3 model
	
	Returns:
	- Map of files

	m3 schemes:
	https://github.com/usethesource/rascal/blob/master/src/org/rascalmpl/library/lang/java/m3/Core.rsc
}
public map[loc, list[str]] retrieveJavaFiles(M3 model) {
	map[loc, list[str]] files = ();
	for (m <- model.containment, m[0].scheme == "java+compilationUnit") {
		files[m[0]] = readFileLines(m[0]);
	}
	return files;
}

@doc{
	Get lines of a unit that are not blank or comments.

	Parameters:
	- loc unitLocation

	Returns:
	- list[str] list of lines from unit
}
public list[str] getUnitLines(loc unitLocation) {
	return [x | x <- readFileLines(unitLocation), !isBlank(x), !isComment(x)];
}