$(document).ready(function(){  
	$(".topMenu").mouseover(function(){ 
		$(this).children(".subMenu").stop().slideDown(); 
	}); 
	$(".topMenu").mouseleave(function(){ $(this).children(".subMenu").stop().slideUp(); 
	}); 
	});

