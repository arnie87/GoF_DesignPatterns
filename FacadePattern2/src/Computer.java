
public class Computer {
	private CPU processor;
    private Memory ram;
    private HardDrive hd;
    
    private long BOOT_ADDRESS_1 = 100;
    private long BOOT_ADDRESS_2 = 200;
    private long BOOT_SECTOR = 111;
    private int SECTOR_SIZE = 1;
        
    public Computer() {
    	this.processor = new CPU();
    	this.ram = new Memory();
    	this.hd = new HardDrive();
    }
    
    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS_1, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS_2);
        processor.execute();
    }
}
