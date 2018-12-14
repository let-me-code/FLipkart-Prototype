
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="productShow.css"/>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script>
$(document).ready(function() {
    $('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});
    $('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});
});
</script>
<title>Insert title here</title>
</head>
<body>

<div class="container">
    <div class="well well-sm">
        <strong>Category Title</strong>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
            </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="glyphicon glyphicon-th"></span>Grid</a>
        </div>
    </div>
    <div id="products" class="row list-group">
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="data:image/jpeg;base64,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" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Product title</h4>
                    <p class="group inner list-group-item-text">
                        Product description... Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                        sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $21.000</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="#" id="addToCart">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
  	</div>


</body>
</html>