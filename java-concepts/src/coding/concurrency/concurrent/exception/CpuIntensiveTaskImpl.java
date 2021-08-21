package coding.concurrency.concurrent.exception;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CpuIntensiveTaskImpl {
	public static void main(String[] args) {
		 int cpuCount = Runtime.getRuntime().availableProcessors();
		 System.out.println("CPU processors Count :: " + cpuCount);
		 ExecutorService service = Executors.newFixedThreadPool(cpuCount);
		// ReentrantLock lock = new ReentrantLock();
		// Condition newCondition = lock.newCondition();

		 Optional<Integer> possible = Optional.of(5);
		 possible.ifPresent(System.out::println);

		 List<Integer> ints = IntStream.of(1, 2, 3, 4,
		 5).boxed().collect(Collectors.toList());

		 System.out.println(ints);

		// lock.lock();

		 for (int i = 0; i < 20; i++) {
		 service.execute(new CpuIntensiveTask());
		 }
	}
}
