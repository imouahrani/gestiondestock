package com.imouahrani.gestiondestock.services;

import com.imouahrani.gestiondestock.dto.ArticleDto;
import com.imouahrani.gestiondestock.dto.LigneCommandeClientDto;
import com.imouahrani.gestiondestock.dto.LigneCommandeFournisseurDto;
import com.imouahrani.gestiondestock.dto.LigneVenteDto;
import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
