package api.ron.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_detalle_compra")
public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "compra_id")
    private Compra compra;
}
