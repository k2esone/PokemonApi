package pl.sdacademy.pokemonapi.pokemonlist;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class PokemonListItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String pokemonDetailsUrl;

    public PokemonListItemEntity(String name, String pokemonDetailsUrl) {
        this.id = id;
        this.name = name;
        this.pokemonDetailsUrl = pokemonDetailsUrl;
    }

}
