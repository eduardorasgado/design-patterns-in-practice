package structural.Bridge.ShapesExample.After.Model;

import structural.Bridge.ShapesExample.After.ColorMapper;

public class Red extends Color {
	private String pantoneCode;

	public Red(String name, String pantoneCode) {
		super(name);
		this.pantoneCode = pantoneCode;
	}

	@Override
	protected String getHexRepresentation() {
		return ColorMapper.mapPantoneToHex(pantoneCode);
	};
}
