module utils::StringUtils

import String;
import IO;

@doc{
	Helper function to detect whitespace
	
	Parameters:
	- str line: line to check for whitespace
	
	Returns:
	- bool
}
public bool isBlank(str line) {
	return size(trim(line)) == 0;
}

@doc{
	Helper function to detect comments.
		
	Parameters:
	- str line: lines to check for comments
	
	Returns:
	- bool
	
	TODO: replace this with matching RegEx expression (proper detection for JavaDoc comments, etc.)
}
public bool isComment(str line) {
	println(line);
	println(trim(line));
	trimmed = trim(line);
	return startsWith(trimmed, "//") || startsWith(trimmed, "/*") || startsWith(trimmed, "*") || endsWith(trimmed, "*/");
}

// TODO: Create a more complex CoC test
