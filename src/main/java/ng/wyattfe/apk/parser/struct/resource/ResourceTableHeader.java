package ng.wyattfe.apk.parser.struct.resource;

import ng.wyattfe.apk.parser.struct.ChunkHeader;
import ng.wyattfe.apk.parser.struct.ChunkType;
import ng.wyattfe.apk.parser.utils.Unsigned;

/**
 * resource file header
 *
 * @author dongliu
 */
public class ResourceTableHeader extends ChunkHeader {
    // The number of ResTable_package structures. uint32
    private int packageCount;

    public ResourceTableHeader(int headerSize, int chunkSize) {
        super(ChunkType.TABLE, headerSize, chunkSize);
    }

    public long getPackageCount() {
        return Unsigned.toLong(packageCount);
    }

    public void setPackageCount(long packageCount) {
        this.packageCount = Unsigned.toUInt(packageCount);
    }
}
