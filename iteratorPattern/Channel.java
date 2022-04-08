package iteratorPattern;
public class Channel {
	private double frequency;
	private ChannelTypeEnum Type;
	
	public Channel(double freq, ChannelTypeEnum type) {
		this.frequency=freq;
		this.Type=type;
	}
	
	public double getFrequency() {
		return frequency;
	}
	
	public ChannelTypeEnum getType() {
		return Type;
	}
	
	@Override
	public String toString() {
		return "Frequency="+this.frequency+", Type="+this.Type;
	}
}
