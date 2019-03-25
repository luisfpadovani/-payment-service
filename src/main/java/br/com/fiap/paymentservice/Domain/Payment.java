package br.com.fiap.paymentservice.Domain;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private int idTransacao;
    private String numeroCartao;
    private String validadeCartao;
    private double valorCompra;
    private String bandeira;
}
