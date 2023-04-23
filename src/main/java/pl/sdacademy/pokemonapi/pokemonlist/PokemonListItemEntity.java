package pl.sdacademy.pokemonapi.pokemonlist;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PokemonListItemEntity {

    @Id
    private Long id;

    private String name;


}
