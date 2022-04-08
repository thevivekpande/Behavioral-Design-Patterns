package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{
	private List<Channel> channelsList;
	
	public ChannelCollectionImpl() {
		channelsList=new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channelsList);
	}
	
	public class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelsList) {
			this.type=type;
			this.channels=channelsList;
		}

		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				Channel c=channels.get(position);
				if(c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				}else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c=channels.get(position);
			position++;
			return c;
		}
		
	}

}
