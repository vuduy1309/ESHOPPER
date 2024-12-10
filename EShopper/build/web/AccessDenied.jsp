    <%-- 
    Document   : AccessDenied
    Created on : Jul 17, 2023, 12:13:17 AM
    Author     : Vu Duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Access Denied</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        
        
        <style>
            body{
                background-color: black;
                color: white;
            }

            h1 {
                color: red;
            }

            h6{
                color: red;
                text-decoration: underline;
            }


        </style>
    </head>
    <body>
        <div class="w3-display-middle">
            <h1 class="w3-jumbo w3-animate-top w3-center"><code>Access Denied</code></h1>
            <hr class="w3-border-white w3-animate-left" style="margin:auto;width:50%">
            <h3 class="w3-center w3-animate-right">You dont have permission to view this site. </h3>
            <h3 class="w3-center w3-animate-right">(Or your account is banned)</h3>
            <h3 class="w3-center w3-animate-zoom">🚫🚫🚫🚫</h3>
            <h6 class="w3-center w3-animate-zoom">error code:403 forbidden</h6>
            <a href="customer" class="nav-item nav-link active"><-- Back to Shop</a>
        </div>
        
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>
</html>
