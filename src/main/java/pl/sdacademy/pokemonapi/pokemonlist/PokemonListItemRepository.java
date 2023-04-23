package pl.sdacademy.pokemonapi.pokemonlist;

import org.springframework.data.jpa.repository.JpaRepository;

interface PokemonListItemRepository extends JpaRepository<PokemonListItemEntity, Long> {
}