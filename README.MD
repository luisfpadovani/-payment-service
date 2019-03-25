#GET
curl -X GET \
  http://localhost:8080/payment/findByid/23 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: aeee2dde-d251-fe8f-8e78-4fde2cb0190d'
  
#PUT
curl -X PUT \
  http://localhost:8080/payment/1 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 91f48409-0cab-d3d2-0017-e3686b1cbbed' \
  -d '{
    "idTransacao": 23,
    "numeroCartao": "79859 45789 15478 16684 487216",
    "validadeCartao": "02/25",
    "valorCompra": 40,
    "bandeira": "DASDASDAS"
}'

#POST
curl -X POST \
  http://localhost:8080/payment/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: e344de3e-6932-798c-f826-aa4c1a3a239b' \
  -d '{
    "idTransacao": 1001,
    "numeroCartao": "79859 45789 15478 16684 487216",
    "validadeCartao": "02/25",
    "valorCompra": 40,
    "bandeira": "DASDASDAS"
}'

#DELETE
curl -X DELETE \
  http://localhost:8080/payment/1 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 576edae1-1aa6-4aad-56a2-beca85729c66'
