function ajaxfunction(){
    var ajaxObject;
    try {
        ajaxObject = new XMLHttpRequest();
    }catch (e){
        try {
            ajaxObject = new ActiveXObject('Msxml2.XMLHTTP');
        }catch (e){
            try {
                ajaxObject = new ActiveXObject('Microsoft.XMLHTTP');
            }catch (e){
                alert("Your browser doen't support AJAX");
            }
        }
    }
    
    if (ajaxObject != null){
        ajaxObject.onreadystatechange = function(){
            if (ajaxObject.readyState == 4){
                var v=ajaxObject.responseText;
                //var x =ajaxObject.responseText.getOwnPropertyNames();
                
                document.getElementById("d1").innerHTML = v;
            }
            
        }
        
        var da = "date";
        var ty = "not";
        //var fname = document.getElementById("txt1").value;
        ajaxObject.open("POST", "tabledata?type="+ty+"&date="+da, true);
	ajaxObject.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	ajaxObject.send();
    }
}

function ajaxfunction2(k){

    var ajaxObject;
    try {
        ajaxObject = new XMLHttpRequest();
    }catch (e){
        try {
            ajaxObject = new ActiveXObject('Msxml2.XMLHTTP');
        }catch (e){
            try {
                ajaxObject = new ActiveXObject('Microsoft.XMLHTTP');
            }catch (e){
                alert("Your browser doen't support AJAX");
            }
        }
    }
    
    if (ajaxObject != null){
        ajaxObject.onreadystatechange = function(){
            if (ajaxObject.readyState == 4){
                var v=ajaxObject.responseText;
                //var x =ajaxObject.responseText.getOwnPropertyNames();
                
                document.getElementById("d1").innerHTML = v;
            }
            
        }
        var da;
        var ty;
        if (k == 1){
            da = document.getElementById("h1").innerHTML;
            ty = "back";
        }else {
            da = document.getElementById("h7").innerHTML;
            ty = "next";
        }

        ajaxObject.open("POST", "tabledata?type="+ty+"&date="+da, true);
	ajaxObject.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	ajaxObject.send();
    }
}