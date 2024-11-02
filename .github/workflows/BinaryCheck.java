	boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0;i<str.length();i++)
	  {
	      if(Character.getNumericValue(str.charAt(i))>1)
	      {
	          return false;
	      }
	  }
	  return true;
	}
