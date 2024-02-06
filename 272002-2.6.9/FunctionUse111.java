import com.alibaba.dubbo.rpc.cluster.support.FailbackClusterInvoker;
public class FunctionUse111 {
public void funcUse() {
FailbackClusterInvoker failbackclusterinvoker = new FailbackClusterInvoker();
failbackclusterinvoker.retryFailed();
}
}