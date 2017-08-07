var validCount=0;
 function view_mom()
{


var z = document.getElementByName("meetingid").value;
if(isNaN(z))
    {
    alert("Incorrect meetingId ");
    validCount++;
    return false;
    } 


var dtformat=document.getElementByName("dateformat").value;
alert(dtformat);

var patterndt=/^[0-9]{4}-[0-9]{2}-[0-9]{2}$/;
if (!patterndt.test(dtformat))
  {
	
     alert("Incorrect date");
     validCount++;
return false;
  }

if(validCount==0)
{
	 return true;
	}
	else
	{
		 return false;
	}
 }
 
 function display_datetextbox()
 {
	
/*	var b=document.getElementById("meetingradio");
*/	if(document.getElementById("dateradio").checked==true)
		{
		document.getElementById("meetingid").style.display="none";
		document.getElementById("dateformat").style.display="block";

		}
	
 }
 
 function display_meetingtextbox()
 {
	 var c=document.getElementById("meetingradio");
		if(c.checked==true)
			{
			document.getElementById("meetingid").style.display="block";
			document.getElementById("dateformat").style.display="none";
			}
		 
 }
 
  
 
 
 