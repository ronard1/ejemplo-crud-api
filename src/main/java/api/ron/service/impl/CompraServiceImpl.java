package api.ron.service.impl;

import api.ron.domain.model.Compra;
import api.ron.domain.repository.CompraRepository;
import api.ron.service.CompraService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CompraServiceImpl implements CompraService {

    private final CompraRepository compraRepository;

    public CompraServiceImpl(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public Compra findById(Long id) {
        return compraRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Compra create(Compra compraToCreate) {
        /*if (compraRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        */
        return compraRepository.save(compraToCreate);
    }
}
