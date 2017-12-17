function myFunction() {
	
 var xmlhttp = new XMLHttpRequest();
xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
	 
        	console.log(this.responseText)
	 }
};
xmlhttp.open("http://http://api.myjson.com/bins/p3z17", true);
xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlhttp.send();
}

myFunction();