package structural.Bridge.ShapesExample.After.Model;

import java.util.List;

import structural.Bridge.ShapesExample.After.ColorMapper;

public class Blue extends Color {
	private List<Integer> rgba;

	public Blue(String name, List<Integer> rgba) {
		super(name);
		this.rgba = rgba;
	}

	@Override
	protected String getHexRepresentation() {
		return ColorMapper.mapRgbaToHex(rgba);
	}
}
