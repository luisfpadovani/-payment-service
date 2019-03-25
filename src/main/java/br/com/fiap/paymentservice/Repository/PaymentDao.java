package br.com.fiap.paymentservice.Repository;
import br.com.fiap.paymentservice.Domain.Payment;
public class PaymentDao {

    private Payment[] paymentArray = null;

    public PaymentDao(){
        paymentArray = new Payment[2000];
        for(int x =0; x < 1000;x++){
            Payment pay = new Payment();
            pay.setIdTransacao(x);
            pay.setBandeira("VISA");
            pay.setNumeroCartao("79859 45789 15478 16684 487216");
            pay.setValidadeCartao("02/25");
            pay.setValorCompra(40.00);
            paymentArray[x] = pay;
        }
    }

    public Payment[] returnList(){
        return paymentArray;
    }

    public Payment findById(int idTransacao){
        return paymentArray[idTransacao];
    }

    public boolean delete(int idTransacao){
        paymentArray[idTransacao] = null;
        return true;
    }

    public boolean update(int idTransacao,Payment pay){
        Payment payUpdate = paymentArray[idTransacao];
        payUpdate.setValorCompra(pay.getValorCompra());
        payUpdate.setValidadeCartao(pay.getValidadeCartao());
        payUpdate.setNumeroCartao(pay.getNumeroCartao());
        payUpdate.setBandeira(pay.getBandeira());
        return true;
    }

    public Payment save(Payment pay){
        Payment paySave = new Payment();
        paySave.setValorCompra(pay.getValorCompra());
        paySave.setValidadeCartao(pay.getValidadeCartao());
        paySave.setNumeroCartao(pay.getNumeroCartao());
        paySave.setBandeira(pay.getBandeira());
        return paySave;
    }
}
