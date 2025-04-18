package ng.wyattfe.apk.parser.struct.resource;

import ng.wyattfe.apk.parser.struct.ChunkHeader;
import ng.wyattfe.apk.parser.struct.ChunkType;

public class NullHeader extends ChunkHeader {
    public NullHeader(int headerSize, int chunkSize) {
        super(ChunkType.NULL, headerSize, chunkSize);
    }
}
