$(":button").click(function() {	
var isbn = this.id;
var myStatus = "#myStatus"+isbn;
var buttonid = "#"+isbn;
$.ajax({
	 url: '/library/v1/books/'+isbn+"?status=lost",
     type: 'PUT',
     success: function(){    	 
    	 //window.location.reload();
    	 $(myStatus).text("lost");
    	 $(buttonid).prop('disabled',true);   	 
    }
});
});