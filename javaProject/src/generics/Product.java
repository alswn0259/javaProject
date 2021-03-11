package generics;

public class Product<T, M> {
	T kind;//generic 문자 영어 대문자 아무거나//generic type 이다 나중에 쓰면됨.
	M model;
	public void setKind(T kind) {
		this.kind = kind;
	}
	public T getKind() {
		return kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public M getModel() {
		return model;
	}
}
