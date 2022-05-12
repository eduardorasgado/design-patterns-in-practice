package doubleDispatch.TableDrivenMethod.SpaceExample.Model;

@FunctionalInterface
public interface CollitionHandler<P> {
	void collideWith(P p);
}
