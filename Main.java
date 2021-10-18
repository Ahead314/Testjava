package com.adama.udacity;

/*Create a ContactsManager object called myContactsManager using the default constructor (we've already done so in the previous page)
        Create a new Contact variable
        Set the name to a friend's name
        Set the phoneNumber field to their phone number
        Call the addContact method in myContactsManager to add that contact
        Repeat steps 2 and 3 for 4 more contacts
        Search for a contact using the method searchContact and print out their phone number

 */

public class Main {
    public static void main(String[] args) {
     ContactsManager myContactsManager = new ContactsManager();
     Contact contact1 = new Contact();
     Contact contact2 = new Contact();
     Contact contact3 = new Contact();
     Contact contact4 = new Contact();
    contact1.setName("Adama");
    contact1.setPhoneNumber("22177341033");
    contact2.setName("Awa");
    contact2.setPhoneNumber("22177111099");
    contact3.setName("Ibou");
    contact3.setPhoneNumber("22177000999");
    contact4.setName("Papa");
    contact4.setPhoneNumber("22177222222");
    myContactsManager.addContact(contact1);
    myContactsManager.addContact(contact2);
    myContactsManager.addContact(contact3);
    myContactsManager.addContact(contact4);
    myContactsManager.searchContact("Adama");
        System.out.println(contact1.phoneNumber);

    }
}
