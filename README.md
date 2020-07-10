# skaffold-dekorate-springcloud-example
Example project built with spring cloud HoxtonSR6, Dekorate, Skaffold.

This repository is an example of how to create spring cloud application and 
hide the complexity of creating kubernetes deployment resources files with [Dekorate](https://github.com/dekorateio/dekorate)
, built with [Jib](https://github.com/GoogleContainerTools/jib) and deploy directly to kubernetes local cluster e.g. minikube/kind/microk8s with [Skaffold](https://github.com/GoogleContainerTools/skaffold)

### Tools used
- Java 8
- [Spring Framework](https://spring.io/projects/spring-cloud)
- [Dekorate](https://github.com/dekorateio/dekorate)
- [Jib](https://github.com/GoogleContainerTools/jib)
- [Skaffold](https://github.com/GoogleContainerTools/skaffold)

### Test run the application
1. Install Skaffold cli from [this link](https://skaffold.dev/docs/install/)
2. Open this project in your favorite IDE (I recommended [Intellij IDEA](https://www.jetbrains.com/idea/) or [VS Code](https://code.visualstudio.com/))
3. Setting up your local/Remote cluster if you did not have any cluster yet, 
you can refer to these for starter.
    - [Kind](https://kind.sigs.k8s.io/) 
    - [Minikube](https://kubernetes.io/docs/setup/learning-environment/minikube/)
3. there are 2 simple approaches to build & deploy the application
    - 3.1 via Command line
      - open your terminal.
      - `cd` to project directory
      ``` 
      $ mvn clean install
      $ skaffold dev
      ```
    - 3.2 via plugins
      - Find maven tab and click on install.
      - ![mvn install](https://i.imgur.com/n3lp6HD.png)
      - Search for plugin named `Cloud Code` by google, install then restart your IDE
      - ![cloud code plugin](https://i.imgur.com/VVXw98S.png)
      - Open Run/Debug Configuration(in the top tools bar)
      - Select `+` sign then choose `Cloud Code : Kubernetes`
      - in Run/Debug Setting.
        - Choose your kube config
        - choose your context via `Deployment` section e.g. minikube/kind
      - click run
