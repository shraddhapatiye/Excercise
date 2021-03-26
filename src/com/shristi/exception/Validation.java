package com.shristi.exception;

 class Validation {
	 String[] names= {"Sam","john","Helen","Ram"};
	public boolean checkName(String name)throws Exception
	{
		try {
		
for(String val:names) {
	
	if(val.equals(name)) {
		throw new Exception("name exist already");
	}
}
		}catch(Exception e) {
			System.out.println("Error..");
			throw e;
		}
	return true;
}
 
}

	
