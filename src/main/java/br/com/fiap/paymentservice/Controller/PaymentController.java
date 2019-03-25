package br.com.fiap.paymentservice.Controller;

import br.com.fiap.paymentservice.Domain.Payment;
import br.com.fiap.paymentservice.Repository.PaymentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Slf4j
@RestController
public class PaymentController {
    PaymentDao payDao;
    Payment[] payList;

    public PaymentController(){
        payDao = new PaymentDao();
        payList = payDao.returnList();
    }

    @GetMapping("/payment/findByid/{idTransacao}")
    public ResponseEntity<Payment> findById(@PathVariable(value="idTransacao", required=true) int idTransacao){

        return new ResponseEntity(payDao.findById(idTransacao), HttpStatus.OK);
    }

    @PutMapping("/payment/{idTransacao}")
    public ResponseEntity<Boolean> update(@PathVariable(value="idTransacao", required=true) int idTransacao,
                                          @RequestBody Payment pay){
        return new ResponseEntity(payDao.update(idTransacao, pay), HttpStatus.OK);
    }


    @DeleteMapping("/payment/{idTransacao}")
    public ResponseEntity<Payment> delete(@PathVariable(value="idTransacao", required=true) int idTransacao){
        return new ResponseEntity(payDao.delete(idTransacao), HttpStatus.OK);
    }

    @PostMapping("/payment")
    public ResponseEntity save(@RequestBody Payment pay){
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(payDao.save(pay).getIdTransacao()).toUri();
        return new ResponseEntity(location, HttpStatus.OK);
    }
}
