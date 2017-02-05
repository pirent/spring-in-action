package chapter5.spittr.data;

public interface SpitterRepository {

	Spitter save(Spitter unsaved);

	Spitter findByUsername(String username);

}
