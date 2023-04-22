package pl.sdacademy.pokemonapi.pokemonlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokeApiListResult {
    private Integer count;
    private String next;
    private String previous;

    private List<PokeApiListItemResult> results;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class PokeApiListItemResult {
    private String name;
    private String url;

}
