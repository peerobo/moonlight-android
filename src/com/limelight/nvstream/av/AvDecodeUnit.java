package com.limelight.nvstream.av;

import java.util.List;

public class AvDecodeUnit {
	public static final int TYPE_UNKNOWN = 0;
	public static final int TYPE_H264 = 1;
	public static final int TYPE_AAC = 2;
	
	private int type;
	private List<AvBufferDescriptor> bufferList;
	private int dataLength;
	private int flags;
	
	public AvDecodeUnit(int type, List<AvBufferDescriptor> bufferList, int dataLength, int flags)
	{
		this.type = type;
		this.bufferList = bufferList;
		this.dataLength = dataLength;
		this.flags = flags;
	}
	
	public int getType()
	{
		return type;
	}
	
	public int getFlags()
	{
		return flags;
	}
	
	public List<AvBufferDescriptor> getBufferList()
	{
		return bufferList;
	}
	
	public int getDataLength()
	{
		return dataLength;
	}
}