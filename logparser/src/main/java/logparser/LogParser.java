package logparser;

import org.util.logviewer.source.LogSource;

import destination.LogDestination;

public interface LogParser {
	public void parse(LogSource source,LogDestination destination,LogSourceConfig logSourceConfig) throws Exception;
}
