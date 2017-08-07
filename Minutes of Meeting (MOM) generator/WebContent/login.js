function validate()
{
	var a=document.login.userId.value;
	var b=document.login.password.value;
	var c=a.length;
	//alert(c);
	var d=b.length;
	//alert(d);
	
	
	if(a=="" && b=="")
		{
			alert("please enter username and password");
			return false;
		}
	else if(a=="")
		{
			alert("Please enter Username");
			return false;
		}
	else if(b=="")
	{
		alert("Please enter Password");
		return false;
	}
	else if(c<0 || c>6)
		{
			alert("Please enter valid user id");
			return false;
		}
	else if( d<6)
	{
		alert("Please enter valid password");
		return false;
	}
	return true;
}
	