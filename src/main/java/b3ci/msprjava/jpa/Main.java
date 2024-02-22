package b3ci.msprjava.jpa;

import b3ci.msprjava.jpa.entities.*;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("msprjava");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        PetStore petStore = new PetStore("PetStore", "Manager");
        Address address = new Address("Rue de la rue", "1", "1234", "City");
        Product product = new Product("1234", "Label", 12.34, ProdType.FOOD);
        Animal animal = new Animal(new java.util.Date(), "Couleur");
        petStore.setAddress(address);
        address.setPetStore(petStore);
        animal.setPetStore(petStore);

        em.persist(petStore);
        em.persist(address);
        em.persist(product);
        em.persist(animal);

        em.getTransaction().commit();

        //Réaliser une requête qui permet d’extraire tous les animaux d’une animalerie donnée
        em.getTransaction().begin();
        TypedQuery<Animal> animalsByPetStore = em.createQuery("SELECT a FROM Animal a WHERE a.petStore = :petStore", Animal.class);
        animalsByPetStore.setParameter("petStore", petStore);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
