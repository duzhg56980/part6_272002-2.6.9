import com.alibaba.dubbo.config.DubboShutdownHook;
public class FunctionUse2038 {
public void funcUse() {
DubboShutdownHook dubboshutdownhook = new DubboShutdownHook();
dubboshutdownhook.destroyAll();
}
}