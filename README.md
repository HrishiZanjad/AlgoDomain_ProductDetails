# AlgoDomain_ProductDetails
Create RESTfull API of Product Details using Java 8  with Spring Boot

Understanding Document:
This is understanding document on how to perform CRUD operation with this REST API. 

Github Link: https://github.com/HrishiZanjad/AlgoDomain_ProductDetails

Follow below Steps to perform various operation on the API.

1.	Create/Save Operation: To save Product in the database.
Provide product details in the Body -> raw
HTTP request: POST
url: http://localhost:8080/api/product/save 

2.	Get Operation: To get all products from the database
HTTP request: GET 
url: http://localhost:8080/api/product/get 
 
3.	Get By ID Operation: To get product with particular Id
HTTP request: GET 
url: http://localhost:8080/api/product/getById/{ID} ,where {ID} is Id of the Product.

4.	Update Operation: To update product details
Provide updated product details in Body-> raw
HTTP request: PUT 
url: http://localhost:8080/api/product/update/{ID} , where {ID} is Id of the Product to be updated

5.	Delete Operation: To perform Delete operation 
HTTP request: Delete
url: http://localhost:8080/api/product/delete/{ID} , where {ID} is Id of the Product to be deleted.

6.	Get Products: To run getProducts method for calculating final price of each product based on discount and other charges.
HTTP request: GET
url: http://localhost:8080/api/product/getProducts/{ID} , where {ID} is Id of the Product for which details to be calculated.
