package api.ron.service;

import api.ron.domain.model.Compra;

public interface CompraService {
    Compra findById(Long id);

    Compra create(Compra compraToCreate);
}
