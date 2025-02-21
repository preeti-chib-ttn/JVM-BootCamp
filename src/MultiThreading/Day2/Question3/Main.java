package MultiThreading.Day2.Question3;
/*Q3) Use a singleThreadExecutor, newCachedThreadPool()
and newFixedThreadPool() to submit a list of tasks and
wait for completion of all tasks.*/

import java.util.concurrent.*;

public class Main {

    // Here I am trying to simulate a file downloading utility
    // that uses a different thread pool for different use cases.
    static void fileDownloadUtility
            (ExecutorService executor,String serviceName, int totalFiles) throws InterruptedException {
        System.out.println(serviceName+" is downloading the files.");
        for(int i=0;i<totalFiles;i++){

            final String filename= "[ File #"+(i+1)+" "+serviceName+" ]";
            boolean isDownloaded=false;
            Future<Boolean> fileDownloadedStatus =executor.submit(()->{
                System.out.println(filename +", "+Thread.currentThread().getName()+", Download Started ***");
                Thread.sleep(300);
                System.out.println(filename+", "+Thread.currentThread().getName()+", Download Done.");
                return true;
            });

            try {
               isDownloaded= fileDownloadedStatus.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }finally {
                System.out.println(filename+" download successfully? "+isDownloaded);
            }
        }
        executor.shutdown();
        boolean allFilesDownloaded = executor.awaitTermination(1,TimeUnit.MINUTES);

        if(allFilesDownloaded) System.out.println("All files downloaded by service name: "+serviceName+"\n\n");
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService oneByOneDownload = Executors.newSingleThreadExecutor();
        fileDownloadUtility(oneByOneDownload,"Single Thread Executor",2);

        ExecutorService parallelFolderDownload =  Executors.newFixedThreadPool(3);
        fileDownloadUtility(parallelFolderDownload,"Fixed Thread Pool",6);

        ExecutorService dynamicFilesDownload = Executors.newCachedThreadPool();
        fileDownloadUtility(dynamicFilesDownload,"Cached Thread Pool",4);
    }
}
