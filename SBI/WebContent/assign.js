var count=0;
function addRow()
{
	
	var empid=document.assign_action.action_item.value;
	
	var br = document.createElement("br");
	var element1 = document.createElement("input");
	element1.type = "text";
	element1.name="empid"+count;
	//alert("ele name"+element1.name);
	element1.setAttribute("value",empid);
	document.getElementById('theForm').appendChild(element1);
	
	
	var cb = document.createElement( "input" ); 
    cb.type = "checkbox"; 
     cb.name="attendance"+count;
     cb.id="attend";
    document.getElementById( 'theForm' ).appendChild( cb ); 
    
    var element3 = document.createElement("input");
	element3.type = "text";
	element3.name="description"+count;
	element3.setAttribute("value",  "");
	document.getElementById('theForm').appendChild(element3);
	
	var element4 = document.createElement("input");
	element4.type = "text";
	element4.name="closure"+count;
	element4.setAttribute("value", "");
	
	document.getElementById('theForm').appendChild(element4);
	 
	if(element1.value=="None")
		{
		element4.disabled="disable";
		cb.disabled="disable";
		}
	
	count++;
  document.getElementById("count1").value= count;
  
 
}
function setCount(count){
	
	var table=document.getElementById('action_assignment');

	var rowCount = table.rows.length;
	var row = table.insertRow(rowCount);

	var cell1 = row.insertCell(0);
	var element1 = document.createElement("input");
	element1.type = "text";
	element1.name="txtbox[]";
	element1.readonly="readonly";
	cell1.appendChild(element1);

	var cell2 = row.insertCell(1);
	var element2 = document.createElement("input");
	element2.type = "text";
	element2.name="txtbox[]";
	element2.readonly="readonly";
	cell2.appendChild(element2);

	var cell3 = row.insertCell(2);
	var element3 = document.createElement("input");
	element3.type = "text";
	element3.name = "txtbox[]";
	cell3.appendChild(element3);
	
	var cell4 = row.insertCell(3);
	var element4 = document.createElement("input");
	element4.type = "text";
	element4.name = "txtbox[]";
	element4.
	cell4.appendChild(element4);
	
	var cell5 = row.insertCell(4);
	var element5 = document.createElement("input");
	element5.type = "text";
	element5.name = "txtbox[]";
	element5.readonly="readonly";
	cell5.appendChild(element5);
	
	
	}


function submit_values()
{
	var table=document.getElementById('action_assignment');

	var rowCount = table.rows.length;
	
	
	for(i=1;i<=rowCount;i++)
		{
		  for(j=1;j<=5;j++)
			  {
			  
			  
			  }
		}
	
}

