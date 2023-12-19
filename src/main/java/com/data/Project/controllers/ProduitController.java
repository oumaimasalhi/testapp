package com.data.Project.controllers;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.Project.Repositories.ProduitRepository;
import com.data.Project.entities.produit;



@Controller
@RequestMapping("/produit")
public class ProduitController {
	@Autowired
	ProduitRepository produitrepository ;

	
	
	@GetMapping("/list")
	//@ResponseBody
    public String list(Model model){
	//produit Produit=new produit("Iphone15","smartphone",5000);
	//produit p=produitrepository.save(Produit); 
	//return "Added successed"+p;
		
	List<produit>Produits=new ArrayList<>();
	Produits=produitrepository.findAll();
	model.addAttribute("Produits",Produits);
	
	return "afficher";
    }
	
	
	//ajouter
	@GetMapping("/add")
	 public String add(){
		
		return "ajout" ;
	}
	
	@PostMapping("/add")
	//@ResponseBody
	public String ajouter(@RequestParam("nom") String nom ,@RequestParam("description") String description,@RequestParam("prix") double prix ) 
	{
		produit P=new produit("nom","description",prix);
		produitrepository.save(P);
		return "redirect:/produit/list"  ;
	}
	
	
	//supprimer 
	/* @GetMapping("delete/{id}")
	public String supprimer(@PathVariable ("id")long id)
	{
		produitrepository.deleteById(id);
		return "redirect: ../list";
	}
	

	
	
	// modifier 
	@GetMapping("update/{id}")
	public String modifier(Model model ,@PathVariable ("id")long id)
	{
		Optional<produit> produit =produitrepository.findById(id);
		model.addAttribute("p",produit);
		return "modifier";
	}
	
	@PostMapping ("update")
	public String missAJour (produit produit)
	{
		produitrepository.save(produit);
		return "redirect:list";
	}


*/



















}
