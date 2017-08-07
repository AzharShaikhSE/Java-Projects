var validCount=0;
function validate_mom()
{	/*alert("hii ankita");*/


	var subject=document.getElementById("subject").value;

	var purpose=document.getElementById("purpose").value;

	var date=document.getElementById("date").value;

	var stime=document.getElementById("stime").value;

	var etime=document.getElementById("etime").value;

	var point=document.getElementById("point").value;

	var decision=document.getElementById("decision").value;

	
	if(subject==0||purpose==0||date==0||stime==0||etime==0||point==0||decision==0)
	{
		alert("Please enter values in all mandatory fields");
		validCount++;
		return false;
		
	}
	
  
	 var patterndt= /^[0-9]{4}-[0-9]{2}-[0-9]{2}$/;

     if (!patterndt.test(date))
       {
    	 validCount++;
          alert("Incorrect date");
return false;
       }
     
     //start and end time validation
     var patterntm= /(([0-1]?[0-9])|2[0-3]):[0-5][0-9]/;     /*?(am|pm|AM|PM)*/
     if (!patterntm.test(stime))
       {
    	 validCount++;
          alert("Incorrect Time");
       return false;   
       }
   
 
     if (!patterntm.test(etime))
{
    	 validCount++;
 alert("Incorrect Time");
 return false;
 }

//Time Field Validation
    /* var starttime1 = document.timevalidate.startTime.value;
     var endtime1 = document.timevalidate.endTime.value;*/
     var dtStart = new Date("1/1/2011 " + stime);
     var dtEnd = new Date("1/1/2011 " + etime);
     var difference = dtEnd - dtStart;
 alert("going in time");
     if (difference > 0)
     {
     
       return true;
    }
     else{  
       validCount++;
     alert("End Time is less than start time!");
     return false;
     }
     
     if(validCount==0)
       {
       return true;
       }
     else{
       return false;
     }
     
} 

	    	  
	  

/*	// regular expression to match required time format
	  re = /^(\d{1,2}):(\d{2})([ap]m)?$/;
	if(form.starttime.value != '') 
	{
	    if(regs = document.Create_mom.starttime.value.match(re)) {
	      if(regs[3]) {
	        // 12-hour value between 1 and 12
	        if(regs[1] < 1 || regs[1] > 12) {
	          alert("Invalid value for hours: " + regs[1]);
	          form.starttime.focus();
	          return false;
	        }
	      } 
	      else {
	    	  //24 hour format
	       if(reg[3]>24)
	    	   {
	    	   alert("Invalid value for hours: " + reg[3]);
	    	   form.starttime.focus();
	    	   return false;
	    	   
	    	 }
	      }
	    }
	      
	     else
	    	  {
	    	  alert("All the inputs have been valid");
	    	  return true;
	    	  }
	     
	    	}

	//regular expression to match required time format
	re = /^(\d{1,2}):(\d{2})([ap]m)?$/;
	if(form.endtime.value != '') 
	{
	  if(regs = document.Create_mom.endtime.value.match(re)) {
	    if(regs[3]) {
	      // 12-hour value between 1 and 12
	      if(regs[1] < 1 || regs[1] > 12) {
	        alert("Invalid value for hours: " + regs[1]);
	        form.endtime.focus();
	        return false;
	      }
	    } 
	    else {
	  	  //24 hour format
	     if(reg[3]>24)
	  	   {
	  	   alert("Invalid value for hours: " + reg[3]);
	  	   form.endtime.focus();
	  	   return false;
	  	   
	  	 }*/
	
	
	
	/*alert("hii");
var sub=document.getElementById("subject").value;
alert("ankita");
var pur=document.getElemntById("purpose").value;
alert("sohail");
var date=document.getElementById("date").value;
alert("sarika");

var stime=document.getElementById("stime").value;
alert("shaan");

var etime=document.getElementById("etime").value;
alert("ankita");

var point=document.getElementById("point").value;
alert("ankita");

var decision=document.getElementById("decision").value;
alert("hello");

if(sub==0||pur==0||date==0||stime==0||etime==0||point==0||decision==0)
{
	alert("Please enter values in all mandatory fields");
	return false;
	
}*/


/*if(sub==0)
{
alert("Please Enter Subject");

}*/
/*
if(pur==0)
	{
	alert("Please Enter Purpose");
	}
if(date==0)
	{
	alert("Please Enter date");
	}
if(stime==0)
{
alert("Please Enter Start time");

}
if(etime==0)
{
alert("Please Enter end time");

}
if(point==0)
{
alert("Please Enter point");

}
if(decision==0)
{
alert("Please Enter Subject");

}

return true;*/





/*
function  add_members_validate()
{	alert("hii");
	
var sub=document.getElementById("subject").value;
alert(sub);

alert(pur);
	var subject=document.Create_mom.subject.value;
	var sublen=subject.length;
	
	var purpose=document.Create_mom.purpose.value;
	var purposelen=purpose.length;
	
	var date=document.Create_mom.date.value;
	var datelen=date.length;
	
	var start=document.Create_mom.stime.value;
	var timelen=start.length;

	var end=document.Create_mom.etime.value;
	var timelen1= end.length;
	
	var points=document.Create_mom.points_discussed.value;
	var pointlen=points.length;

	var decision=document.Create_mom.decisions.value;
	var decisionlen=decision.length;
	alert("hii2");
	
	if(sub==0)
		{
		alert("Please Enter Subject");
		return false;
		}
	
	if(purpose==0)
		{
		alert("Please Enter Purpose");
		return false;
		}
	
	if(sublen==""||purposelen==""||datelen==""||timelen==""||timelen1==""||pointlen==""||memberslen=="")
	{
		alert("Please enter values in all mandatory fields");
		return false;	
	}
	
	 else
	 return true;
}




function validate(){
	
	var start = document.Create_mom.stime.value;
	var end = document.Create_mom.etime.value;
	
	var dtStart = new Date("1/1/2011 " + start);
	var dtEnd = new Date("1/1/2011 " + end);
	var difference_in_milliseconds = dtEnd - dtStart;

	if (difference_in_milliseconds < 0)
	{
	alert("End date is before start date!");
	return false;
	}
	else
		return true;
	}

function validateDOB(){

  
   
  var dob = document.Create_mom.date.value;
 
 var pattern= /(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-\d{4}/;
  //var pattern =/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
  if (dob == null || dob == "" || !pattern.test(dob))
  {
      alert("wrong date");
     return false;
  }
  else
	  return true;
  
 
}

function final_validation()
{
	add_members_validate();
	validate();
	 validateDOB();
	 validateDOB();
}
*/
