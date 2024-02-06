import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
public class FunctionUse1 {
public void funcUse() {
RoundRobinLoadBalance roundrobinloadbalance = new RoundRobinLoadBalance();
roundrobinloadbalance.doSelect(null,null,null);
}
}