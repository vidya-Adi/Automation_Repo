package com.time.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test(priority=1,invocationCount=3)
public void createCustomer()
{
Reporter.log("createcustomer", true);
}
@Test(dependsOnMethods="createCustomer")
public void modifyCustomer()
{
Reporter.log("modifycustomer", true);
}
@Test(dependsOnMethods= {"createCustomer","modifyCustomer"})
public void deleteCustomer()
{
Reporter.log("deletecustomer", true);
}
}
