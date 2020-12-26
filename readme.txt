1. Tested POD yml and it works. Tested using IP shown for kubectl get pods and curl -i http://<ip>:8090/user/validate?username=abc

2. Then tested deployment yaml and each pod deployed using above curl and changing IP

3. Then tested service yaml and IP shown for ClusterIP and above curl and IP changed

4. HPA should work fine
