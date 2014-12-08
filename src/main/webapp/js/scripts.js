/**
 * @author Victor
 */

$(document).ready(function() {	
    $('.clientes').dataTable();
    $('.usuarios').dataTable();
    setTimeout(function(){
    	$('.systemAlert').alert('close');
    }, 3500);
} );