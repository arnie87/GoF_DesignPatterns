
public class HardDrive {
	public byte[] read(long lba, int size) {
		
		System.out.println("HardDrive::read("+lba+","+size+")");
		byte[] hardDrive = {(byte)lba, (byte)size};
		
		return hardDrive;
	}
}
