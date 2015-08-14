function calculate(id){
	/*var num_value = document.getElementById("num_value"+id);
	var price = document.getElementById("price"+id);
	var diameter = document.getElementById("diameter");
	var length = document.getElementById("length");
	var totalPrice = document.getElementById("totalPrice"+id);
	var density = 7.38;
	
	var totalMass = document.getElementById("totalMass"+id);
	
	totalMass.value = ((Math.PI * (Math.pow(diameter, 2) / 4) * length * density) * num_value.value).toFixed(2);
	totalPrice.value = (totalMass.value * price.value).toFixed(2);*/
	
	


	    var x = document.getElementById("num_value"+id).value;
	    document.getElementById("totalPrice"+id).innerHTML = x;

	
	
	
}