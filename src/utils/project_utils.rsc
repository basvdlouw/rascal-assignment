module utils::project_utils

import IO;
import lang::java::jdt::m3::Core;

@doc{
	Creates an M3 model of an Eclipse project.
	
	Parameters:
	- loc projectLocation: A location to an Eclipse project
	
	Returns: 
	- M3 model;
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
	
	TODO: 
	use java+class or java+compilationUnit scheme?
	should probably use compilationUnit to count package statements, imports (interfaces?) as well
	https://github.com/usethesource/rascal/blob/master/src/org/rascalmpl/library/lang/java/m3/Core.rsc
}
map[loc, list[str]] retrieveJavaFiles(M3 model) {
	map[loc, list[str]] files = ();
	for (m <- model.containment, m[0].scheme == "java+compilationUnit") {
		files[m[0]] = readFileLines(m[0]);
	}
	return files;
}