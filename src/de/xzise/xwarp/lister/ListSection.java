package de.xzise.xwarp.lister;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import me.taylorkelly.mywarp.WMPlayerListener;
import me.taylorkelly.mywarp.Warp;

public class ListSection implements Iterable<Warp> {

	public final String title;
	private final List<Warp> warps;
	
	public ListSection(String title) {
		this.title = title;
		this.warps = new ArrayList<Warp>(WMPlayerListener.LINES_PER_PAGE);
	}
	
	public void addWarp(Warp warp) {
		this.warps.add(warp);
	}
	
	public void addWarps(Collection<Warp> warp) {
		this.warps.addAll(warp);
	}

	@Override
	public Iterator<Warp> iterator() {
		return this.warps.iterator();
	}
	
}